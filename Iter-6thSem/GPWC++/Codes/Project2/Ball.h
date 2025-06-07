#pragma once
#include <SFML/Graphics.hpp>
using namespace sf;
#include <iostream>
class Ball{
    private:
    Vector2f m_position;
    CircleShape m_shape;
    float m_speed=1000.0f;
    float m_directionX=.2f;
    float m_directionY=.2f;
    public:
    Ball(float startX,float startY);
    FloatRect get_position();
    CircleShape get_shape();
    float getXVelocity();
    void reboundSides();
    void reboundBatOrTop();
    void reboundBottom();
    void update(Time dt);
};