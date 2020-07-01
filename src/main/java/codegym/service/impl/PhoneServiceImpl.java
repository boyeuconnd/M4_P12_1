package codegym.service.impl;

import codegym.model.Phone;
import codegym.repository.PhoneRepository;
import codegym.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;

public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public Iterable<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Phone findById(Long id) {
        return phoneRepository.findOne(id);
    }

    @Override
    public Phone save(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public Phone remove(Long id) {
        Phone deletePhone = phoneRepository.findOne(id);
        phoneRepository.delete(id);
        return deletePhone;
    }
}
