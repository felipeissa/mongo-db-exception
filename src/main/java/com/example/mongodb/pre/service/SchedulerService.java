package com.example.mongodb.pre.service;

import com.example.mongodb.pre.dao.StorageClassDao;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    private StorageClassDao storageClassDao;

    public SchedulerService(StorageClassDao storageClassDao) {
        this.storageClassDao = storageClassDao;
    }


    @Scheduled(fixedDelayString = "1000")
    public void readDataFromDatabase() {
        System.out.println("Reading data from database");
        var data = this.storageClassDao.getStorage();
        System.out.println(data);
    }
}
