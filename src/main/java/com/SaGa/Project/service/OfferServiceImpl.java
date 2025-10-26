package com.SaGa.Project.service;

import com.SaGa.Project.model.Offer;
import com.SaGa.Project.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl implements OfferService {

    @Autowired
    private OfferRepository offerRepository;
    @Override
    public Offer addOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public List<Offer> getOffersByAdmin(String adminId) {
        return offerRepository.findByAddedBy(adminId);
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }
}
