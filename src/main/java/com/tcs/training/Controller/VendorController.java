package com.tcs.training.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.training.Entity.Vendor;
import com.tcs.training.Service.VendorService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	VendorService vservice;

	@PostMapping("/add")
	public ResponseEntity<?> addVendor(@Valid @RequestBody Vendor vendor) {
        try {
            Vendor savedVendor = vservice.addVendor(vendor);
            return ResponseEntity.ok(savedVendor);
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                .body(Map.of("error", e.getMessage()));
        }
    }
}
