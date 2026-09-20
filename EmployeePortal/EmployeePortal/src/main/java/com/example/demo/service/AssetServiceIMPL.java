package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AssetRequest;
import com.example.demo.repository.AssetRepository;

@Service
public class AssetServiceIMPL implements AssetService {

	@Autowired
	private AssetRepository repository;

	@Override
	public AssetRequest save(AssetRequest asset) {
		return repository.save(asset);
	}

	@Override
	public AssetRequest update(AssetRequest asset) {
		return repository.save(asset);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public AssetRequest getById(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<AssetRequest> getAll() {
		return repository.findAll();
	}

}