import requests

api_url = "https://codingame.readthedocs.io/en/stable/api.html"
response = requests.get(api_url)

if response.status_code == 200:
    api_data = response.json()  # Parse JSON response
    # Now you can work with the 'api_data' dictionary
    # Extract the information you need from the dictionary
else:
    print("Failed to retrieve data from the API")
