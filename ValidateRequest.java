 public class ValidateRequest extends StringRequest {
        //서버 url 설정(php파일 연동)
        final static  private String URL="자신의 서버 주소/UserValidate.php";
        private Map<String,String> map;

        public ValidateRequest(String userID, Response.Listener<String>listener){
            super(Request.Method.POST,URL,listener,null);

            map=new HashMap<>();
            map.put("userID",userID);
        }

        @Override
        protected Map<String, String> getParams() throws AuthFailureError {
            return map;
        }
}
