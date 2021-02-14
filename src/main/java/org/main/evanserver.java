
/*
 * Copyright (c) $today.year.EvanServer is licensed under Attribution 4.0 International. (https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1) (https://github.com/person1234-ux/evanserver).
 */

package org.main;

import org.chat.blockplugincommand;
import org.commands.*;
import org.event.AXE;
import org.event.FoodEAting;

import org.event.join;
import org.items.*;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;



public class evanserver extends SimplePlugin {


	@Override
	protected void onPluginStart() {
		Common.log("evanserver plugin started by Person");
		Golden_sword gw = new Golden_sword();
		Super_Potato po = new Super_Potato();
		God_Potato go = new God_Potato();
		Custom_carot co = new Custom_carot();
		Special_soup so = new Special_soup();
		Lighting_axe li = new Lighting_axe();
		evanhead eh = new evanhead();
		registerEvents(new join());
		registerEvents(new AXE());
		po.potatositem();
		go.goditem();
		co.customcarot();
		li.axe();
		registerEvents(new FoodEAting());
		registerCommand(new about());
		so.soup();
		eh.Evanskull();
		gw.customgoldensword();
		Person_head ph = new Person_head();
		ph.personhead();
		kfc kf = new kfc();
		kf.kfc_chicken();
		registerCommand(new spawn());
		registerCommand(new discord());
		registerCommand(new rules());
		registerCommand(new github());
		registerEvents(new blockplugincommand());
		registerCommand(new host());
		registerCommand(new sponsor());

	}
}