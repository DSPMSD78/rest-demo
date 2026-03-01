package com.think.rest_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.think.rest_demo.exception.CloudVendorNotFoundException;
import com.think.rest_demo.model.CloudVendor;
import com.think.rest_demo.repository.CloudVendorRepository;
import com.think.rest_demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String CreateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor created successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor updated successfully";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Cloud Vendor deleted successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        if(!cloudVendorRepository.existsById(vendorId)) {
            throw new CloudVendorNotFoundException("Cloud Vendor with id " + vendorId + " not found");
        }
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
    
}
