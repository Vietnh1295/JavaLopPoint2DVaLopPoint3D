public class Main {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,5);
        System.out.println(point2D);
        for(float value:point2D.getXY())
        {
            System.out.println(value);
        }
        Point3D point3D=new Point3D(4,3,2);
        System.out.println(point3D);
        for (float value:point3D.getXYZ())
        {
            System.out.println(value);
        }

    }
    static class Point2D
    {private float x=0.0f,y=0.0f;

        public Point2D()
        {

        }
        public Point2D(float x,float y)
        {
            this.x=x;
            this.y=y;
        }
        public float getX()
        {
            return this.x;
        }
        public float getY()
        {
            return this.y;
        }
        public void setX(float x)
        {
            this.x=x;
        }
        public void setY(float y)
        {
            this.y=y;
        }
        public void setXY(float x, float y)
        {
            this.x=x;
            this.y=y;
        }
        public float[] getXY()
        {
            float[] array={this.getX(),this.getY()};
            return array;
        }
        public  String toString()
        {
            return "Point2D has "
                    +"X= "
                    +getX()
                    +" Y= "
                    +getY()
                    ;
        }

    }
    static class Point3D extends Point2D
    {
        private float z=0.0f;
        public Point3D()
        {}
        public Point3D(float x,float y,float z)
        {
            super(x,y);
            this.z=z;
        }
        public float getZ()
        {
            return  this.z;
        }
        public void set(float z)
        {
            this.z=z;
        }
        public void setXYZ(float x,float y,float z)
        {
            super.setX(x);
            super.setY(y);
            this.z=z;
        }
        public float[] getXYZ()
        {
            float[] array={super.getX(),super.getY(),getZ()};
            return  array;

        }
        public  String toString()
        {
            return "Point3D has "
                    +"X= "
                    +super.getX()
                    +" Y= "
                    +super.getY()
                    +" Z= "
                    +getZ()
                    ;
        }
    }
}
