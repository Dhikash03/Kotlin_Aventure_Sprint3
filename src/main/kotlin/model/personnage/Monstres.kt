package model.personnage

import model.item.Arme
import model.item.Armure
import model.item.Item

class Monstres(nom: String,
               pointDeVie: Int,
               pointDeVieMax: Int,
               attaque: Int,
               defense: Int,
               endurance: Int,
               vitesse: Int,
               armeEquipee: Arme? = null,
               armureEquipee: Armure? = null,
               inventaire: MutableList<Item> = mutableListOf() ): Personnage(nom,pointDeVie,pointDeVieMax, attaque, defense, endurance, vitesse, armeEquipee, armureEquipee, inventaire) {

}