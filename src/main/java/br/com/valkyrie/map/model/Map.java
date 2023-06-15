package br.com.valkyrie.map.model;

import br.com.valkyrie.game.model.Game;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb0003_map")
public class Map {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "a0003_map_id")
    private Long id;

    @Column(name = "a0003_mapName")
    private String name;

    @Column(name = "a0003_roundsTeamOne", insertable = false, columnDefinition = "default 0")
    private Long roundsTeamOne;
    @Column(name = "a0003_roundsTeamTwo", insertable = false, columnDefinition = "default 0")
    private Long roundsTeamTwo;

    @ManyToOne()
    @JoinColumn(name = "a0002_game_id")
    private Game game;

    @Column(name = "a0003_hadOvertime", insertable = false, columnDefinition = "default false")
    private boolean hadOvertime;

    @Column(name = "a0003_map_order")
    private Long order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoundsTeamOne() {
        return roundsTeamOne;
    }

    public void setRoundsTeamOne(Long roundsTeamOne) {
        this.roundsTeamOne = roundsTeamOne;
    }

    public Long getRoundsTeamTwo() {
        return roundsTeamTwo;
    }

    public void setRoundsTeamTwo(Long roundsTeamTwo) {
        this.roundsTeamTwo = roundsTeamTwo;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public boolean isHadOvertime() {
        return hadOvertime;
    }

    public void setHadOvertime(boolean hadOvertime) {
        this.hadOvertime = hadOvertime;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    
}
