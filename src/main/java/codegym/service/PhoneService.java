package codegym.service;

import codegym.model.Phone;

public interface PhoneService {
    Iterable<Phone> findAll();
    Phone findById(Long id);
    Phone save(Phone phone);
    Phone remove(Long id);
}
