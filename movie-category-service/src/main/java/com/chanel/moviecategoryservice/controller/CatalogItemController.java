package com.chanel.moviecategoryservice.controller;

import com.chanel.moviecategoryservice.model.CatalogItem;
import com.chanel.moviecategoryservice.model.Movie;
import com.chanel.moviecategoryservice.model.Rating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogItemController {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(String userId){

        RestTemplate restTemplate = new RestTemplate();

        //let's create a list of
        //lets assume this is response we got from a user who watches the movies
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("4567", 3)
        );

        //for each rating we replace the rating with a catalogitem
        //just had coding it by making a list and return it back
        return ratings.stream().map(rating -> {

            Movie movie = restTemplate.getForObject( "http://localhost:8081/movies/" + rating.getMovieId(), Movie.class);

            return new CatalogItem(movie.getName(), "Description", rating.getRating());
                })
                .collect(Collectors.toList()); //then collect to a list and return it back
    }
}
