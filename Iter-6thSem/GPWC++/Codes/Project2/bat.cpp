#include "Bat.h"
using namespace sf;
//Bat class constructor 
Bat::Bat(float startX,float startY){
    m_position.x = startX;
    m_position.y=startY;
    m_shape.setSize(Vector2f(100.0,10.0));
    m_shape.setPosition(m_position);
}
    FloatRect Bat::get_position(){
        return m_shape.getGlobalBounds();
    }
RectangleShape Bat::get_shape(){
    return m_shape;
}
void Bat::moveright(){
    m_movingright=true;
}
void Bat::moveleft(){
    m_movingleft=true;
}
void Bat::stopright(){
    m_movingright=false;
}
void Bat::stopleft(){
    m_movingleft=false;
}
void Bat::update(Time dt){
    if(m_movingleft){
        m_position.x-=m_speed*dt.asSeconds();
        // extra code to confirm bat should be not
        if(m_position.x<0){
            stopleft();
        }
    }
    if( m_movingright){
        m_position.x += m_speed * dt.asSeconds();
        if(m_position.x>1920){
        stopright();
        }

    }
    m_shape.setPosition(m_position);

}