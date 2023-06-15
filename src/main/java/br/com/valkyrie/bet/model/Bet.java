package br.com.valkyrie.bet.model;

import java.sql.Date;
import br.com.valkyrie.game.model.Game;
import br.com.valkyrie.user.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb0004_bet")
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a0004_bet_id")
    private Long id;

    @ManyToOne
    private User user_id;
    @ManyToOne
    private Game game_id;

    @Column(name = "a0004_isClosed", insertable = false, columnDefinition = "default false")
    private boolean isClosed;

    @Column(name = "a0004_initial_date", insertable = false, columnDefinition = "timestamp default NOW()")
    private Date initial_date;
    @Column(name = "a0004_close_date", columnDefinition = "timestamp")
    private Date close_date;

    @Column(name = "a0004_bet_odd")
    private Double odd;

    @Column(name = "a0004_hasUserWin", insertable = false, columnDefinition = "default false")
    private boolean hasUserWin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Game getGame_id() {
        return game_id;
    }

    public void setGame_id(Game game_id) {
        this.game_id = game_id;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Date getInitial_date() {
        return initial_date;
    }

    public void setInitial_date(Date initial_date) {
        this.initial_date = initial_date;
    }

    public Date getClose_date() {
        return close_date;
    }

    public void setClose_date(Date close_date) {
        this.close_date = close_date;
    }

    public Double getOdd() {
        return odd;
    }

    public void setOdd(Double odd) {
        this.odd = odd;
    }

    public boolean isHasUserWin() {
        return hasUserWin;
    }

    public void setHasUserWin(boolean hasUserWin) {
        this.hasUserWin = hasUserWin;
    }

    
}
