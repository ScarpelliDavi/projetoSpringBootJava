package com.davi.projetoSpringBootJava.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private  OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    // metodo que compara e retorna o valor do codigo. joga uma excecao se o valor for invalido
    public static OrderStatus valueOf(int code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
