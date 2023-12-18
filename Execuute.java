abstract class Branch{
    public abstract boolean validatePhotoProof(String proof);
    public abstract boolean validateAddressProof(String proof);
    public void openAccount(String photoProof,String addressProof,int amount){
      if(amount>=1000){
        if(validateAddressProof(addressProof) && validatePhotoProof(photoProof)){
          System.out.println("Account opened");
        }
        else{
          System.out.println("cannot open account");
        }
      }
      else{
        System.out.println("cannot open account");
      }
    }
  }

class MumbaiBranch extends Branch{
    public boolean validatePhotoProof(String proof){
      if(proof.equalsIgnoreCase("pan card")){
        return true;
      }
      return false;
    }
    public boolean validateAddressProof(String proof){
      if(proof.equalsIgnoreCase("ration card")){
        return true;
      }
      return false;
    }
  }
  
class Execuute{
  public static void main(String[] args){
    Branch mumbaiBranch=new MumbaiBranch();
    mumbaiBranch.openAccount("pan card","ration card",2000);
  }
}