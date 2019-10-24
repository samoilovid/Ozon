package ru.itpark;

public class CartService {
    private int amount;
    private int amountDiscount;
    private int numberGoods;
    private int size = 10;
    private Pen[] cart = new Pen[size];

    public void add(Pen pen) {
        int index = pen.getIndex();
        if (cart[index] == null) {
            cart[index] = pen;
            amount += cart[index].getPrice();
            amountDiscount += pen.getDiscountPrice();
            numberGoods++;

        }
    }

    public void remove(Pen pen) {
        int index = pen.getIndex();
        if (cart[index] != null) {
            cart[index] = pen;
            amount -= cart[index].getPrice();
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

    public Pen[] getCart() {
        return cart;
    }

    public void setCart(Pen[] cart) {
        this.cart = cart;
    }
}
