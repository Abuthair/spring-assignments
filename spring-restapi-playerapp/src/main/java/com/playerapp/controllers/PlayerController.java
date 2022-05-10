package com.playerapp.controllers;

import com.playerapp.model.Player;
import com.playerapp.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player-api")
public class PlayerController {

    @Autowired
    IPlayerService iPlayerService;

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return  iPlayerService.addPlayer(player);
    }
    @PutMapping("/players")
    public void updatePlayer(@RequestBody Player player){
         iPlayerService.updatePlayer(player);
    }
    @DeleteMapping("/players/playerId/{playerId}")
    public void deletePlayer(@PathVariable("playerId")int playerId){
        iPlayerService.deletePlayer(playerId);
    }
    @GetMapping("/players")
    public List<Player> showPlayer(){
        return iPlayerService.getAll();
    }
    @GetMapping("/players/name/{name}")
    public List<Player> showByName(@PathVariable("name")String name){
        return iPlayerService.getByName(name);
    }
    @GetMapping("/players/name/{name}/specialist/{specialist}")
    public List<Player> showByNameAndSpecialist(@PathVariable("name")String name,@PathVariable("specialist")String specialist){
        return  iPlayerService.getByNameAndSpecialist(name, specialist);
    }
    @GetMapping("/players/specialist/{specialist}")
    public  List<Player> showBySpecialist(@PathVariable("specialist")String specialist){
        return iPlayerService.getBySpecialist(specialist);
    }
    @GetMapping("/players/specialist/{specialist}/batting/{batting}")
    public  List<Player> showBySpecialistAndBatting(@PathVariable("specialist")String specialist,@PathVariable("batting")String batting){
        return iPlayerService.getBySpecialistAndBatting(specialist,batting);
    }
    @GetMapping("/players/specialist/{specialist}/bowling/{bowling}")
    public List<Player> showBySpecialistAndBowling(@PathVariable("specialist")String specialist,@PathVariable("bowling")String bowling){
        return iPlayerService.getBySpecialistAndBowling(specialist, bowling);
    }
    @GetMapping("/players/name/{name}/basePrice/{basePrice}")
    public  List<Player> showByNameAndBasePrice(@PathVariable("name")String name,@PathVariable("basePrice")double basePrice){
        return iPlayerService.getByNameAndBasePrice(name, basePrice);
    }
    @GetMapping("/players/stateTeam/{stateTeam}")
    public List<Player> showByStateTeam(@PathVariable("stateTeam")String stateTeam){
        return iPlayerService.getByStateTeam(stateTeam);
    }
    @GetMapping("/players/iplTeam/{iplTeam}")
    public List<Player> showByIplTeam(@PathVariable("iplTeam")String iplTeam){
        return iPlayerService.getByIplTeam(iplTeam);
    }
   @GetMapping("/players/stateTeam/{stateTeam}/iplTeam/{iplTeam}")
    public List<Player> showByStateTeamAndIplTeam(@PathVariable("stateTeam")String stateTeam,@PathVariable("iplTeam")String iplTeam){
        return iPlayerService.getByStateTeamAndIplTeam(stateTeam, iplTeam);
   }
}
