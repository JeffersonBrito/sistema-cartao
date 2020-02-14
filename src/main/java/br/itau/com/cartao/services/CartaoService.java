package br.itau.com.cartao.services;

import br.itau.com.cartao.repositories.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {
    @Autowired
    private CartaoRepository cartaoRepository;

}
