#include "Bat.h"

#include <sstream>

#include <SFML/Graphics.hpp>

int main()
{
    // Create a video mode object
    VideoMode vm(1366, 768);

    // Create and open a window for the game
    RenderWindow window(vm, "Pong",Style::Fullscreen);
    // Create a bat at the bottom center of the screen
    Bat bat(1366 / 2, 768 - 20);

    // Create a ball
    
    // Create a Text object called HUD
    Text hud;

    // A cool retro-style font
    Font font;
    font.loadFromFile("font/DS-DIGI.TTF");

    // Set the font to our retro-style
    hud.setFont(font);

    // Make it nice and big
    hud.setCharacterSize(75);

    // Choose a color
    hud.setFillColor(Color::White);
    // set string
    hud.setString("Score:0 Lives:3");

    hud.setPosition(20, 20);
    int score = 0;
    int lives = 3;

    // Here is our clock for timing everything
    Clock clock;

    while (window.isOpen())
    {
       
        Event event;
        while (window.pollEvent(event))
        {
            if (event.type == Event::Closed)
                // Quit the game when the window is closed
                window.close();
        }

        // Handle the player quitting
        if (Keyboard::isKeyPressed(Keyboard::Escape))
        {
            window.close();
        }

        // Handle the pressing and releasing of the arrow keys
        if (Keyboard::isKeyPressed(Keyboard::Left))
        {
            if(bat.getPosition().left<0)
            {
                bat.stopLeft();
            }else{
                bat.moveLeft();
            }
        }
        else
        {
            bat.stopLeft();
        }

        if (Keyboard::isKeyPressed(Keyboard::Right))
        {
            if(bat.getPosition().left+bat.getPosition().width>1366)
            {
                bat.stopRight();
            }else{
                bat.moveRight();
            }
            
        }
        else
        {
            bat.stopRight();
        }

        Time dt = clock.restart();
        // bat update
        bat.update(dt);
        // ball update
        

        // Update the HUD text
        std::stringstream ss;
        ss << "Score:" << score << " Lives:" << lives;
        hud.setString(ss.str());

       
        window.clear();
        window.draw(hud);
        // draw bat
        window.draw(bat.getShape());
        // draw ball

        window.display();
    }

    return 0;
}