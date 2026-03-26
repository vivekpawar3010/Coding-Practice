import requests
import csv

def get_solved_problems(username):
    url = "https://leetcode.com/graphql"
    
    # GraphQL Query for Recent Accepted Submissions
    query = """
    query recentAcSubmissions($username: String!, $limit: Int!) {
        recentAcSubmissionList(username: $username, limit: $limit) {
            id
            title
            titleSlug
            timestamp
        }
    }
    """
    
    variables = {
        "username": username,
        "limit": 380  # Public limit is usually 20
    }
    
    response = requests.post(url, json={'query': query, 'variables': variables})
    
    if response.status_code == 200:
        data = response.json()['data']['recentAcSubmissionList']
        
        # Save to CSV
        with open('my_solved_leetcode.csv', 'w', newline='', encoding='utf-8') as f:
            writer = csv.writer(f)
            writer.writerow(['ID', 'Title', 'Link'])
            for sub in data:
                link = f"https://leetcode.com/problems/{sub['titleSlug']}/"
                writer.writerow([sub['id'], sub['title'], link])
        
        print(f"Successfully saved {len(data)} problems to 'my_solved_leetcode.csv'")
    else:
        print("Failed to fetch data. Check your username or internet connection.")

# Use your username
get_solved_problems("vivek_pawar-3010")