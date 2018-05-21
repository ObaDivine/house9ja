/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house9ja.housenaija.repository;

import com.house9ja.housenaija.model.States;
import java.util.List;

/**
 *
 * @author Brian A. Okon <brian.okon@entitytechnology.com>
 */
public interface StatesAndLGAsRepositoryCustom {
    public List<States> getStateLGAs(String state);    
    public List<States> getStates();
    public List<States> getLGAs();
}
