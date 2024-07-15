package com.example.demo.service;

public interface IConvertidorDatos {

    <T> T obtenerDatos(String json, Class<T> clase);
}