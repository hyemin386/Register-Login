public class LoginRequest extends StringRequest {

    //서버 url 설정(php파일 연동)
    final static  private String URL="자신의 호스팅 주소/Login2.php";
    private Map<String,String>map;

    public LoginRequest(String userID, String userPassword, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
