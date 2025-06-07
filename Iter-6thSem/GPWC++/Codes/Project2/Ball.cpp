#include "Ball.h"
//This the constructor function
Ball::Ball(float startX,float startY){
    m_position.x=startX;
    m_position.y=startY;
    m_shape.setRadius(10.0);
    m_shape.setPosition(m_position);

}
FloatRect Ball::get_position(){
    return m_shape.getGlobalBounds();
}
CircleShape Ball::get_shape(){
return m_shape;
}
float Ball::getXVelocity(){
    return m_directionX;
}
void Ball::reboundSides(){
    m_directionX=-m_directionX;
}
void Ball::reboundBatOrTop(){
    m_directionY=-m_directionY;
}
void Ball::reboundBottom(){
    m_position.y=0;
    m_position.x=400;
    m_directionY=-m_directionY;
}
void Ball::update(Time dt){
    //update the ball position variables
    m_position.y+=m_directionY*m_speed*dt.asSeconds();
    m_position.x+=m_directionX*m_speed*dt.asSeconds();
    //move the ball and bat
    m_shape.setPosition(m_position);
}