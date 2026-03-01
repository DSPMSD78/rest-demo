package com.think.rest_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.think.rest_demo.model.CloudVendor;
import com.think.rest_demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendor(@PathVariable("vendorId") String vendorId) {
        return  this.cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendors() {
        return this.cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String CreateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        return this.cloudVendorService.CreateCloudVendor(cloudVendor);
        
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
        return this.cloudVendorService.updateCloudVendor(cloudVendor);
    }

    @DeleteMapping("delete/{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId) {
        return this.cloudVendorService.deleteCloudVendor(vendorId);
    }
    
}   
