
public class interact
{
    private Object[][] Obj;
    public interact(Object[][] Object)
    {
        Obj = Object;
        
    }
    public boolean checkNorthD(int a, int b){
        boolean vaf = false;
            try{
                if(Obj[a - 1][b] instanceof Hero){
            
                    vaf = true;
                }
            } catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
    
        }
        return vaf;
    }
    public boolean checkSouthD(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a+1][b] instanceof Hero){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        return vaf;
        }
    public boolean checkEastD(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b+1] instanceof Hero){
                vaf = true;
             }
            }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkWestSh(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b-1] instanceof Farmer2){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkNorthSh(int a, int b){
        boolean vaf = false;
            try{
                if(Obj[a - 1][b] instanceof Farmer2){
            
                    vaf = true;
                }
            } catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
    
        }
        return vaf;
    }
    public boolean checkSouthSh(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a+1][b] instanceof Farmer2){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        return vaf;
        }
    public boolean checkEastSh(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b+1] instanceof Farmer2){
                vaf = true;
             }
            }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkWestS(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b-1] instanceof Farmer1){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkNorthS(int a, int b){
        boolean vaf = false;
            try{
                if(Obj[a - 1][b] instanceof Farmer1){
            
                    vaf = true;
                }
            } catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
    
        }
        return vaf;
    }
    public boolean checkSouthS(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a+1][b] instanceof Farmer1){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        return vaf;
        }
    public boolean checkEastS(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b+1] instanceof Farmer1){
                vaf = true;
             }
            }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkWestD(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b-1] instanceof Hero){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkNorth(int a, int b){
        boolean vaf = false;
            try{
                if(Obj[a - 1][b] instanceof Potion){
            
                    vaf = true;
                }
            } catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
    
        }
        return vaf;
    }
    public boolean checkSouth(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a+1][b] instanceof Potion){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        return vaf;
        }
    public boolean checkEast(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b+1] instanceof Potion){
                vaf = true;
             }
            }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkWest(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b-1] instanceof Potion){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
   
    
    public boolean checkNorthM(int a, int b){
        boolean vaf = false;
            try{
                if(Obj[a - 1][b] instanceof Monster){
            
                    vaf = true;
                }
            } catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
    
        }
        return vaf;
    }
    public boolean checkSouthM(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a+1][b] instanceof Monster){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            vaf = false;
        }
        return vaf;
        }
    public boolean checkEastM(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b+1] instanceof Monster){
                vaf = true;
             }
            }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    public boolean checkWestM(int a, int b){
        boolean vaf = false;
        try{
            if(Obj[a][b-1] instanceof Monster){
                vaf = true;
            }
        }catch(ArrayIndexOutOfBoundsException e){
                vaf = false;
            }
        return vaf;
    }
    
}
