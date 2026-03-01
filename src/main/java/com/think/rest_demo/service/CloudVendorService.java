package com.think.rest_demo.service;

import java.util.List;

import com.think.rest_demo.model.CloudVendor;

public interface CloudVendorService {
    public String CreateCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public CloudVendor getCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendors();
}
