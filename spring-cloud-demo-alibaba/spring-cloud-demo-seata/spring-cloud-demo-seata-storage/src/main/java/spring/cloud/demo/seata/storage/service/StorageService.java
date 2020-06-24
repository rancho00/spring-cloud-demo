package spring.cloud.demo.seata.storage.service;



public interface StorageService {

    void decrease(Long productId,Integer count);
}
