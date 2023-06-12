package tn.esprit.ms1gestioncandidat;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.ms1gestioncandidat.entities.Candidat;
import tn.esprit.ms1gestioncandidat.repositories.CandidatRepository;
import java.util.stream.Stream;

@SpringBootApplication
public class Ms1GestionCandidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1GestionCandidatApplication.class, args);
	}
	@Bean
	ApplicationRunner start (CandidatRepository candidatRepository){
		return args -> {
			Stream.of(
//					Candidat.builder("Salim","Ben Jrad", "sbj@gmail.com") ;
//					Candidat.builder("Ali","Ben ali", "ali@gmail.com"))
					Candidat.builder().nom("med")
							.prenom("selim")
							.email("med@gmail.com")
							.build(),
					Candidat.builder().nom("dellegi")
							.prenom("selim")
							.email("med@gmail.com")
							.build())
			.forEach
			(
					Candidat ->
					{
						candidatRepository.save(Candidat) ;
					}
			);
			candidatRepository.findAll().forEach(System.out::println);
		};
	}
}
