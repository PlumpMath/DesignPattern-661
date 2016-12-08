package BuilderPattern;

/**
 * Created by zhaoying on 2016/12/8.
 */

/**
 * Product 类自身带有了构建类 Builder 。
 */
public class Product {

    private int width;
    private int height ;
    private String name ;


    public Product() {
    }

    public Product(Builder builder) {
        this.width = builder.width ;
        this.height = builder.height ;
        this.name = builder.name ;
    }

    public static class Builder{

        private int width;
        private int height ;
        private String name ;

        public Builder() {  // 设置默认值
            this.width = 0;
            this.height = 0;
            this.name = "default" ;
        }

        // 流式操作,返回 Builder 本身。
        public Builder setWidth(int width) {
            this.width = width;
            return this ;
        }


        public Builder setHeight(int height) {
            this.height = height;
            return this ;
        }

        public Builder setName(String name) {
            this.name = name;
            return this ;
        }

        public Product build(){
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Product.Builder builder = new Product.Builder();
        builder.setHeight(100)
                .setWidth(200)
                .setName("product");

        System.out.println(builder.build().toString());
    }
}
