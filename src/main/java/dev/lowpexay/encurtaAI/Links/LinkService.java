package dev.lowpexay.encurtaAI.Links;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class LinkService {
	//gerar url aleatória
	private LinkRepository linkRepository;
	
	public LinkService(LinkRepository linkRepository) {
		this.linkRepository = linkRepository;
	}
	
	public String gerarUrlAleatoria() {
        int length = ThreadLocalRandom.current().nextInt(5, 11);
		return RandomStringUtils.randomAlphanumeric(length);
	}
	
	public Link encurtarUrl(String urlOriginal) {
		Link link = new Link();
		link.setUrlLong(urlOriginal);
		link.setUrlShort(gerarUrlAleatoria());
		link.setUrlCreatedIn(LocalDateTime.now());
		link.setUrlQRCode("Indisponível no momento");
        System.out.println(urlOriginal);
		return linkRepository.save(link);
	}
	
	public Link obterUrlOriginal(String urlShort) {
		try {
			return linkRepository.findByUrlShort(urlShort).orElse(null);
		}catch (Exception erro){
			throw new RuntimeException("URL não existe nos nossos registros", erro);
		}
	}
}
