package ru.homework.genealogy_tree;

import ru.homework.genealogy_tree.Human.Human1;
import ru.homework.genealogy_tree.Human.Human2;
import ru.homework.genealogy_tree.Human.Human3;
import ru.homework.genealogy_tree.Tree.VeneologiTree;
import ru.homework.genealogy_tree.WriterAndReader.*;


public class Main {
    public static void main (String[] args) {
        /*VeneologiTree geneologiTree = new VeneologiTree();
        Human1 human1 = new Human1();
        Human2 human2 = new Human2();
        Human3 human3 = new Human3();

        geneologiTree.addHuman(human1);
        geneologiTree.addHuman(human3);
        geneologiTree.addHuman(human2);*/
        new Writer();
        new Reader();


    }

}
