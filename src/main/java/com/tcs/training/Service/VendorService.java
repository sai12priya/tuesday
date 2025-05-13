package com.tcs.training.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.training.Entity.Product;
import com.tcs.training.Entity.Vendor;
import com.tcs.training.Repository.ProductRepository;
import com.tcs.training.Repository.VendorRepository;

import jakarta.transaction.Transactional;

@Service
public class VendorService {
	@Autowired
	VendorRepository vrepo;
	@Autowired
	ProductRepository prepo;

	@Transactional
    public Vendor addVendor(Vendor vendor) {
        // Validate vendor data
        if(vendor.getProduct() == null) {
            throw new IllegalArgumentException("Vendor must have a product");
        }
        
        // Save product first
        Product product = prepo.save(vendor.getProduct());
        
        // Associate product with vendor
        vendor.setProduct(product);
        
        // Save vendor
        return vrepo.save(vendor);
    }

}
