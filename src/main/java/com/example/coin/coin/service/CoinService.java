package com.example.coin.coin.service;

import com.example.coin.coin.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CoinService {

    @Autowired
    CoinRepository repo;

    public int buy(HashMap<String, String> params) {

        return repo.buy(params);
    }

    public ArrayList<HashMap<String, Object>> selectBuy(String email) {
        return repo.selectBuy(email);
    }
}
