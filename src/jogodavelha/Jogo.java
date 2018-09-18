/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Aluno
 */
public class Jogo {
    private int[][] tabuleiro;
    
    Jogo(){
        tabuleiro = new int[3][3];
    }
    public void inicializar(){
        for(int i=0; i < 3; ++i){
            for(int j=0; j < 3; ++j){
                tabuleiro[i][j] = 0;
            }
        }
    }
    public void realizarJogada(int i, int j, boolean jogador){//i e j são os indices e jogador é true quando for o jogador 1 e false caso contrário
        if(jogador){//caso seja o jogador 1
            tabuleiro[i][j] = 1;
        }
        else{//caso seja o jogador 2
            tabuleiro[i][j] = 2;
        }
    }
    public boolean verificarVitoria(boolean jogador){//retorna true caso seja vitoria
        int comparar;
        if(jogador){//caso seja o jogador 1
            comparar = 1;
        }
        else{//caso seja o jogador 2
            comparar=2;
        }
        for(int i=0; i < 3; ++i){//verifica na horizontal
            int somatorio = 0;
            for(int j=0; j < 3; ++j){
                if(tabuleiro[i][j] == comparar){
                    somatorio++;
                }
            }
            if(somatorio == 3){
                return true;
            }
        }
        for(int j=0; j < 3; ++j){//verifica na vertical
            int somatorio = 0;
            for(int i=0; i < 3; ++i){
                if(tabuleiro[i][j] == comparar){
                    somatorio++;
                }
            }
            if(somatorio == 3){
                return true;
            }
        }
        //verifica nas diagonais
        int somatorio = 0;
        if(tabuleiro[0][0] == comparar){
                    somatorio++;
        }
        if(tabuleiro[1][1] == comparar){
                    somatorio++;
        }
        if(tabuleiro[2][2] == comparar){
                    somatorio++;
        }
        if(somatorio == 3){
            return true;
        }
        somatorio=0;
        if(tabuleiro[0][2] == comparar){
            somatorio++;
        }
        if(tabuleiro[1][1] == comparar){
            somatorio++;
        }
        if(tabuleiro[2][0] == comparar){
            somatorio++;
        }
        if(somatorio == 3){
            return true;
        }
        return false;
    }   
}
