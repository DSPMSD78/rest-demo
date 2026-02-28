package com.think.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.think.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

    CloudVendor cloudVendor;

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendor(String vendorId) {
        return  cloudVendor;
    }

    // @PostMapping("/add")
    // public String addCloudVendor(@RequestBody CloudVendor cloudVendor) {
    //     this.cloudVendor = cloudVendor;
    //     return "Cloud Vendor added successfully";
    // }

    @PostMapping
    public String CreateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("delete/{vendorId}")
    public String deleteCloudVendor(String vendorId) {
        this.cloudVendor = null;
        return "Cloud Vendor deleted successfully";
    }
    
}   
