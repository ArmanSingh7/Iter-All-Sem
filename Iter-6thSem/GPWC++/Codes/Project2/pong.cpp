#include "Bat.h"
#include "Ball.h"
#include<SFML/Graphics.hpp>
#include<sstream>
using namespace sf;
int main(){
    //create videomode
    VideoMode vm(1366,768);
    //create window
    RenderWindow window(vm,"Pong" , Style::Fullscreen);

    //create bat
    Bat bat(1366/2,768-20);
    //create ball
    Ball ball(1366/2,0);

    //create hud (heads up display)
    Text hud;

    Font font;
    font.loadFromFile("font/DS-DIGI.TTF");
    hud.setFont(font);
    hud.setFillColor(Color::White);
    hud.setCharacterSize(75);
    hud.setString("Score:0 Lives:3");
    hud.setPosition(20,20);

    //Initialize score and lives
    int score = 0;
    int lives = 3;
    //Clock
    Clock clock;
    //main loop
    while(window.isOpen()){
        //event handling
        Event event;
        while(window.pollEvent(event)){
            if(event.type == Event::Closed){
                window.close();
            }
        }
        //handle the game
        if (Keyboard ::isKeyPressed(Keyboard::Escape))
        {
            window.close();
        }
        //Handle the playing input
        if (Keyboard::isKeyPressed(Keyboard::Left))
        {
            if(bat.get_position().left<0)
            {
                bat.stopleft();
            }else{
                bat.moveleft();
            }
        }
        else
        {
            bat.stopleft();
        }

        if (Keyboard::isKeyPressed(Keyboard::Right))
        {
            if(bat.get_position().left+bat.get_position().width>1366)
            {
                bat.stopright();
            }else{
                bat.moveright();
            }
            
        }
        else
        {
            bat.stopright();
        }
        //update the time
        Time dt = clock.restart();
        //update the bat
        bat.update(dt);

        //update the ball
        ball.update(dt);

        //update the score message
        std::stringstream ss;
        ss<<"score: "<<score<<"Lives"<<lives;
        hud.setString(ss.str());

        //Ball hitting the bottom
        if(ball.get_position().top>window.getSize().y){
            //reverse the ball direction
            ball.reboundBottom();
            //remove live
            lives--;
            //check the zero lives
            if(lives<1){
                //game over
                score=0;
                //reset lives
                lives=3;
            }
        }
        //ball hitting the top
        if(ball.get_position().top<0){
            ball.reboundBatOrTop();
            //add score
            score++;
        }

        //draw
        window.clear();
        window.draw(hud);
        window.draw(bat.get_shape());
        window.draw(ball.get_shape());
        window.display();
    }
    return 0;

}