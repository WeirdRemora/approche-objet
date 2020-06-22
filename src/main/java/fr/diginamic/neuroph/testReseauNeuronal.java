package fr.diginamic.neuroph;

import java.util.Random;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;

/** 
 * @author Leo
 * Utilisation de la librarie Neuroph pour créer un réseau de neurones simulant la porte logique OU
 */
public class testReseauNeuronal {
	
	public static void main(String args[]) {
		//Une porte OU prend 2 booléens en entrée et renvoie 1 booléen
		MultiLayerPerceptron neuralNetwork = new MultiLayerPerceptron(2, 2, 1); 		
		DataSet dataSet = new DataSet(2, 1);
		
		//Le jeu de données est constitué de 2 booléens aléatoires b1 et b2 et du résultat de la porte OU entre ces deux booléens b3
		//on répète l'opération 100 fois
		Random rd = new Random(); 
		for(int i=0 ; i<100 ; i++) {
			boolean b1 = rd.nextBoolean();
			boolean b2 = rd.nextBoolean();
			boolean b3 = b1 || b2;
			//on convertit les booléens en tableaux de doubles pour le dataSet (1D si true, 0D si false)
			double[] dataIn = new double[]{b1?1D:0D,b2?1D:0D};
			double[] dataOut = new double[]{b3?1D:0D};
			dataSet.addRow(new DataSetRow(dataIn,dataOut));
		}
		neuralNetwork.learn(dataSet);
		
		int essais = 1000; //nombre d'essais
		int essaisCorrects = 0; //nombre d'essais corrects
		for(int i=0; i<essais ; i++) {
			boolean b1 = rd.nextBoolean();
			boolean b2 = rd.nextBoolean();
			double dataIn1 = b1?1D:0D;
			double dataIn2 = b2?1D:0D;
			neuralNetwork.setInput(dataIn1,dataIn2);
			neuralNetwork.calculate();
			double output = neuralNetwork.getOutput()[0];
			//on convertit le résultat en booléen en arrondissant à l'entier le plus proche (1=true, 0=false)
			boolean outputBool = (Math.round(output)==1)?true:false;
			//si le résultat correspond à celui attendu, on augmente le nombre d'essais corrects
			if(outputBool == (b1 || b2)) {
				essaisCorrects++;
			}
		}
		System.out.println("Taux d'exactitude : "+(double)essaisCorrects/(double)essais*100+" %");
	}
}
