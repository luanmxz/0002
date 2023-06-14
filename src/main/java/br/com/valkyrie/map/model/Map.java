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

    @Column(name = "a0003_roundsTeamOne")
    private Long roundsTeamOne;
    @Column(name = "a0003_roundsTeamTwo")
    private Long roundsTeamTwo;

    @ManyToOne()
    @JoinColumn(name = "a0002_game_id")
    private Game game;

    @Column(name = "a0003_hadOvertime")
    private boolean hadOvertime;

    @Column(name = "a0003_map_order")
    private Long order;
}
