package com.howtodoinjava.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.service.EmployeeService;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService service;


    @GetMapping("/addUser")
    public ModelAndView addUsers(@RequestParam(value = "id", required = true) String id1, @RequestParam(value = "firstName", required = true) String fName, @RequestParam(value = "lastName", required = true) String lName, @RequestParam(value = "email") String emil1, @RequestParam(value = "password") String password1, @RequestParam(value = "mobileNumber") String mobNum, @RequestParam(value = "accountNumber") String accountNum, @RequestParam(value = "adharNumber") String adharNum) throws RecordNotFoundException {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(Long.valueOf(id1));
        employeeEntity.setFirstName(fName);
        employeeEntity.setLastName(lName);
        employeeEntity.setEmail(emil1);
        employeeEntity.setPassword(password1);
        employeeEntity.setMobileNumber(Long.valueOf(mobNum));
        employeeEntity.setAccountNumber(Long.valueOf(accountNum));
        employeeEntity.setAdharNumber(Long.valueOf(adharNum));
        EmployeeEntity updated = service.createOrUpdateEmployee(employeeEntity);
        ResponseEntity<EmployeeEntity> employeeEntityResponseEntity = new ResponseEntity<EmployeeEntity>(updated, new HttpHeaders(), HttpStatus.OK);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("LoginPage");
        return modelAndView;
    }

    @GetMapping("delete/{id}")
    public ModelAndView deleteEmployeeById(@PathVariable("id") Long id)
            throws RecordNotFoundException {
        service.deleteEmployeeById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Register");
        return modelAndView;
    }

    @PostMapping("/tologin")
    public ModelAndView xyz(HttpServletRequest request, Model model) {
        String fname = request.getParameter("first_name");
        String Epassword = request.getParameter("password");
        ModelAndView modelAndView = new ModelAndView();

        EmployeeEntity employeeEntity1 = service.checkLoginDetail(fname, Epassword);
        int flag = 0;

        if (employeeEntity1 != null) {

            model.addAttribute("employeeEntity1", employeeEntity1);
            modelAndView.setViewName("WelcomePage");

        } else {
            modelAndView.setViewName("LoginPage");

        }
        return modelAndView;

    }

    @GetMapping("/update/{id}")
    public ModelAndView updateEmployee(@PathVariable("id") String id1, Model model) throws RecordNotFoundException {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        EmployeeEntity empUdate = service.updateEmployee(Long.valueOf(id1));
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("empUdate", empUdate);
        modelAndView.setViewName("Update");

        return modelAndView;


    }
}
