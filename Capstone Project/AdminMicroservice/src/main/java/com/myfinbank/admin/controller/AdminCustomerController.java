package com.myfinbank.admin.controller;


import com.myfinbank.admin.feign.CustomerClient;
import com.myfinbank.admin.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/customers")
public class AdminCustomerController {

    private final CustomerClient customerClient;

    @GetMapping
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerClient.getAllCustomers());
        return "admin/customer-list";
    }

    @GetMapping("/{id}")
    public String viewCustomer(@PathVariable Long id, Model model) {
        model.addAttribute("customer", customerClient.getCustomerById(id));
        return "admin/customer-view";
    }

    @GetMapping("/{id}/edit")
    public String editCustomer(@PathVariable Long id, Model model) {
        model.addAttribute("customer", customerClient.getCustomerById(id));
        return "admin/customer-edit";
    }

    @PostMapping("/{id}/edit")
    public String updateCustomer(@PathVariable Long id, @ModelAttribute CustomerDto dto) {
        customerClient.updateCustomer(id, dto);
        return "redirect:/admin/customers";
    }

    @PostMapping("/{id}/activate")
    public String activateCustomer(@PathVariable Long id) {
        customerClient.activateCustomer(id);
        return "redirect:/admin/customers";
    }

    @PostMapping("/{id}/deactivate")
    public String deactivateCustomer(@PathVariable Long id) {
        customerClient.deactivateCustomer(id);
        return "redirect:/admin/customers";
    }
}
