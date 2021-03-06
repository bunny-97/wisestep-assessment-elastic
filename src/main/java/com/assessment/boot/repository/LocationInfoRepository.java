package com.assessment.boot.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

import com.assessment.boot.model.LocationInfo;

public interface LocationInfoRepository extends ElasticsearchRepository<LocationInfo, String> {

}
