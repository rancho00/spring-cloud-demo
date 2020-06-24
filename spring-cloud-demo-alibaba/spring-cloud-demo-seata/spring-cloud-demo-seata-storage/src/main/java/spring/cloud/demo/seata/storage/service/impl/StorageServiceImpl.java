package spring.cloud.demo.seata.storage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cloud.demo.seata.storage.mapper.StorageMapper;
import spring.cloud.demo.seata.storage.service.StorageService;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        storageMapper.decrease(productId,count);
    }
}
