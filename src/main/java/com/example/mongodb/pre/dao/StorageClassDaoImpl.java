package com.example.mongodb.pre.dao;

import com.example.mongodb.pre.model.StorageClass;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StorageClassDaoImpl implements StorageClassDao {

    private MongoTemplate mongoTemplate;

    public StorageClassDaoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    @Override
    public List<StorageClass> getStorage() {
        Criteria criteria = Criteria.where("STATUS").is("E")
            .and("FIELD_NUMBER").is(1);

        Query query = new Query(criteria);

        return this.mongoTemplate.find(query, StorageClass.class);
    }
}
