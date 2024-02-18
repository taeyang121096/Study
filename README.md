# Study My Skill

1. Spring

2. Front

3. SpringBoot

# ORM vs SQL mapper

    시나리오
    1. 사용자가 회원가입을 한다.(id, pw)
    2. 로그인 후 main 페이지 접근 가능
    3. 은행에서 계좌를 생성한다.
    4. 계좌이체가 가능하다.
    
    - 계좌, 은행, 유저

    계좌 : id(pk), no(계좌번호), balance(잔액), name(계좌명), user_no(유저 번호), register_date(생성 일자), bank_no(은행 번호)
    은행 : id(pk), no, name
    유저 : id, no, user_id, user_pw, name
    계좌 내역 :id, account_no, bank_no, payment, use_date, type
