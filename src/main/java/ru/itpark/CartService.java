package ru.itpark;

import java.util.Arrays;

public class CartService {
    private int amount;
    private int amountDiscount;
    private int numberGoods;
    private int size = 10;
    private Pen[] addCart = new Pen[size];

    public void add(Pen pen) {
        int index = pen.getIndex();
        if (addCart[index] == null) {
            addCart[index] = pen;
            amount += addCart[index].getPrice();
            amountDiscount += pen.getDiscountPrice();
            numberGoods++;

        }
    }

    public void remove(Pen pen) {
        int index = pen.getIndex();
        if (addCart[index] != null) {
            addCart[index] = pen;
            amount -= addCart[index].getPrice();
            amountDiscount -= pen.getDiscountPrice();
            numberGoods--;

        }
    }

    @Override
    public String toString() {
        return "Корзина:" +
                "Сумма=" + amount +
                ", Сумма со скидкой=" + amountDiscount +
                ", колличестко товара=" + numberGoods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountDiscount() {
        return amountDiscount;
    }

    public void setAmountDiscount(int amountDiscount) {
        this.amountDiscount = amountDiscount;
    }

    public int getNumberGoods() {
        return numberGoods;
    }

    public void setNumberGoods(int numberGoods) {
        this.numberGoods = numberGoods;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pen[] getAddCart() {
        return addCart;
    }

    public void setAddCart(Pen[] addCart) {
        this.addCart = addCart;
    }
}
