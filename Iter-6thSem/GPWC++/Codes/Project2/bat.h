#pragma once //in compilation time it compile one time the headder file not every time while compile
#include<SFML/Graphics.hpp>
using namespace sf;

class Bat{
    Vector2f m_position;
    RectangleShape m_shape;

    float m_speed=1000.f;
    bool m_movingright=false;
    bool m_movingleft=false;

    public:
    Bat(float startX, float startY);
    FloatRect get_position();
    RectangleShape get_shape();
    void moveright();
    void moveleft();
    void stopright();
    void stopleft();
    void update(Time dt);
};