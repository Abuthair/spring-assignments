package com.playerapp.controllers;

import com.playerapp.model.Player;
import com.playerapp.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player-api")
public class PlayerController {

    @Autowired
    IPlayerService iPlayerService;

    @PostMapping("/players")
    public ResponseEntity<Player>addPlayer(@RequestBody Player player){
         iPlayerService.addPlayer(player);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping("/players")
    public ResponseEntity<Object> updatePlayer(@RequestBody Player player){
        iPlayerService.updatePlayer(player);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    @DeleteMapping("/players/playerId/{playerId}")
    public ResponseEntity<Object> deletePlayer(@PathVariable("playerId")int playerId){
        iPlayerService.deletePlayer(playerId);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc", "deleted using PlayerId");
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping("/players")
    public ResponseEntity<List<Player>> showPlayer(){
        List<Player> players= iPlayerService.getAll();
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting All Player");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/name/{name}")
    public ResponseEntity<List<Player>> showByName(@PathVariable("name")String name){
     List<Player> players=   iPlayerService.getByName(name);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player Name");
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/name/{name}/specialist/{specialist}")
    public ResponseEntity<List<Player>> showByNameAndSpecialist(@PathVariable("name")String name,@PathVariable("specialist")String specialist){
        List<Player> players= iPlayerService.getByNameAndSpecialist(name, specialist);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player Name"+name+"Specialist"+specialist);
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/specialist/{specialist}")
    public ResponseEntity<List<Player>> showBySpecialist(@PathVariable("specialist")String specialist){
     List<Player> players =    iPlayerService.getBySpecialist(specialist);
     HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player Specialist"+specialist);
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/specialist/{specialist}/batting/{batting}")
    public  ResponseEntity<List<Player>> showBySpecialistAndBatting(@PathVariable("specialist")String specialist,@PathVariable("batting")String batting){
        List<Player> players = iPlayerService.getBySpecialistAndBatting(specialist,batting);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player Specialist"+specialist+"batting"+batting);
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/specialist/{specialist}/bowling/{bowling}")
    public ResponseEntity<List<Player>> showBySpecialistAndBowling(@PathVariable("specialist")String specialist,@PathVariable("bowling")String bowling){
        List<Player>  players= iPlayerService.getBySpecialistAndBowling(specialist, bowling);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player Specialist"+specialist+"bowling"+bowling);
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/name/{name}/basePrice/{basePrice}")
    public  ResponseEntity<List<Player>> showByNameAndBasePrice(@PathVariable("name")String name,@PathVariable("basePrice")double basePrice){
        List<Player> players = iPlayerService.getByNameAndBasePrice(name, basePrice);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player Name"+name+"basePrice"+basePrice);
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/stateTeam/{stateTeam}")
    public ResponseEntity<List<Player>> showByStateTeam(@PathVariable("stateTeam")String stateTeam){
        List<Player> players =iPlayerService.getByStateTeam(stateTeam);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player stateTeam"+stateTeam);
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/players/iplTeam/{iplTeam}")
    public ResponseEntity<List<Player>> showByIplTeam(@PathVariable("iplTeam")String iplTeam){

        List<Player> players = iPlayerService.getByIplTeam(iplTeam);
        HttpHeaders headers = new HttpHeaders();
        headers.add("desc","getting  Player iplTeam"+iplTeam);
        ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
        return responseEntity;
    }
   @GetMapping("/players/stateTeam/{stateTeam}/iplTeam/{iplTeam}")
    public ResponseEntity<List<Player>> showByStateTeamAndIplTeam(@PathVariable("stateTeam")String stateTeam,@PathVariable("iplTeam")String iplTeam){
        List<Player> players = iPlayerService.getByStateTeamAndIplTeam(stateTeam, iplTeam);
       HttpHeaders headers = new HttpHeaders();
       headers.add("desc","getting  Player stateTeam"+stateTeam+"iplTeam"+iplTeam);
       ResponseEntity<List<Player>> responseEntity = new ResponseEntity<>(players,headers,HttpStatus.OK);
       return responseEntity;
   }
}
