package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AssetRequest;

public interface AssetService {

	AssetRequest save(AssetRequest asset);

	AssetRequest update(AssetRequest asset);

	void delete(Integer id);

	AssetRequest getById(Integer id);

	List<AssetRequest> getAll();

}