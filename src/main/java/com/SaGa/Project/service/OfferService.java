package com.SaGa.Project.service;

import com.SaGa.Project.model.Offer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OfferService {
    Offer addOffer(Offer offer);

    List<Offer> getOffersByAdmin(String adminId);

    List<Offer> getAllOffers();
}
